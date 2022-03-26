package src.midterm;

public class Question5 {

    public static void main(String[] args) {

        Camera camera1 = Camera.getInstance();

        camera1.setCameraName("Camera 001");

        Camera camera2 = Camera.getInstance();
        //just can get camera1,so name is camera1
        System.out.println(camera1.getCameraName());
        System.out.println(camera2.getCameraName());

        camera2.setCameraName("Camera 002");
        //change camera2's name , camera1 will also change
        System.out.println(camera1.getCameraName());
        System.out.println(camera2.getCameraName());
    }
}
class Camera {

    //instance
    private static Camera _instance;
    private static Object obj = new Object();
    private String cameraName = "";
    //private constructor
    private Camera() {
    }

    //getter and setter
    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }



    public static Camera getInstance() {

        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Camera();
                }
            }
        }

        return _instance;
    }

}

