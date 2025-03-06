package template;

public class SD extends VideoEditing {
    public SD(String videolink) {
        super(videolink);
    }

    @Override
    public void renderVideo(String videolink) {
        System.out.println("rendered by SD");
    }
}
