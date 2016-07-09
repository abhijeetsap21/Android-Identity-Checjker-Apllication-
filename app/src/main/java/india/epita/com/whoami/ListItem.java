package india.epita.com.whoami;

/**
 * Created by Abhijeet on 4/13/2016.
 */
public class ListItem {

        private int imageId;
        private String title;

        public ListItem(String title, int imageId) {
            this.imageId = imageId;
            this.title = title;

        }
        public int getImageId() {
            return imageId;
        }
        public void setImageId(int imageId) {
            this.imageId = imageId;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
    }

