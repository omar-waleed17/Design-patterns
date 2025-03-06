package template;

public abstract class VideoEditing {
    public VideoEditing(String videolink) {

        enhancingVideoQuality(videolink);
        applyColorCorrection(videolink);
        enhanceAudioQuality(videolink);
        applyFilter(videolink);
        renderVideo(videolink);
    }
    private void enhancingVideoQuality(String videolink) {
        System.out.println("enhanced video quality: " );
    }
    private void applyColorCorrection(String videolink) {
        System.out.println("apply color correction: " );
    }
    private void enhanceAudioQuality(String videolink) {
        System.out.println("enhanced audio quality: " );
    }
    private void applyFilter(String videolink) {
        System.out.println("apply filter: " );
    }
    public abstract void renderVideo(String videolink);
}
