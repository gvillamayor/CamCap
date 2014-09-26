package camcap;

import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.objdetect.CascadeClassifier;



public class DetectFaceHaar 
{
    private CascadeClassifier faceDetector;
    private MatOfRect faceDetections;
    
    
    public DetectFaceHaar()
    {
        try
        {
            faceDetector = new CascadeClassifier("haarcascade_frontalface_alt2.xml");
            faceDetections = new MatOfRect();
            CamCap.mensajeSalida("Detector Inicializado");
        }
        catch(Exception e)
        {
            CamCap.mensajeSalida(e.toString());
        }
    }
    public MatOfRect detectar(Mat image)
    {
        faceDetector.detectMultiScale(image, faceDetections);
        return faceDetections;
    }
}
