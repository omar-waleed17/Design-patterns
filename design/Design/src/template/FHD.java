package template;

public class FHD extends VideoEditing{
    public FHD(String videolink) {
        super(videolink);
    }

    @Override
    public void renderVideo(String videolink) {
        System.out.println("rendered by FHD");
    }
}
