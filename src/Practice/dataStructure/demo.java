package Practice.dataStructure;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class demo extends Thread {
        private final String url;
        private final String destinationPath;
        private volatile boolean stopped = false;

        public demo(String url, String destinationPath) {
            this.url = url;
            this.destinationPath = destinationPath;
        }

        @Override
        public void run() {
            try {
                URL downloadUrl = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) downloadUrl.openConnection();
                int fileSize = connection.getContentLength();
                InputStream inputStream = connection.getInputStream();
                FileOutputStream outputStream = new FileOutputStream(destinationPath);

                byte[] buffer = new byte[1024];
                int bytesRead;
                int totalBytesRead = 0;

                while ((bytesRead = inputStream.read(buffer)) != -1 && !stopped) {
                    outputStream.write(buffer, 0, bytesRead);
                    totalBytesRead += bytesRead;
                }

                double progress = (double) totalBytesRead / fileSize * 100;
                System.out.printf("Download Progress: %.2f%%\n", progress);

                outputStream.close();
                inputStream.close();
                connection.disconnect();

                if (stopped) {
                    System.out.println("Download stopped by user.");
                    File file = new File(destinationPath);
                    if (file.exists()) {
                        file.delete();
                    }
                } else {
                    System.out.println("Download complete.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void stopDownload() {
            stopped = true;
            interrupt();
        }

}
