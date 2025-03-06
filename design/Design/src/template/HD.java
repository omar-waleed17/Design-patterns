package template;

public class HD extends VideoEditing{
    public HD(String videolink) {
        super(videolink);
    }

    @Override
    public void renderVideo(String videolink) {
        System.out.println("rendered by HD");
    }
}
