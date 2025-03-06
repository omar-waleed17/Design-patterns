package Builder;

public class GameEngine {
    private String graphicsquality;
    private String SoundOptions;
    private String ControlPrefereneces;

    private GameEngine(GameEngineBuilder builder) {
        ControlPrefereneces = builder.getControlPrefereneces();
        SoundOptions = builder.getSoundOptions();
        this.graphicsquality =builder.getGraphicsquality();
    }

    public String getSoundOptions() {
        return SoundOptions;
    }

    public String getControlPrefereneces() {
        return ControlPrefereneces;
    }

    public String getGraphicsquality() {
        return graphicsquality;
    }

    public static class GameEngineBuilder
    {
        private String graphicsquality;
        private String SoundOptions;
        private String ControlPrefereneces;

        public GameEngineBuilder setGraphicsquality(String graphicsquality) {
            this.graphicsquality = graphicsquality;
            return this;
        }

        public GameEngineBuilder setSoundOptions(String soundOptions) {
            SoundOptions = soundOptions;
            return this;
        }

        public GameEngineBuilder setControlPrefereneces(String controlPrefereneces) {
            ControlPrefereneces = controlPrefereneces;
            return this;
        }
        public GameEngine build() {
           return  new GameEngine(this);
        }

        public String getGraphicsquality() {
            return graphicsquality;
        }

        public String getSoundOptions() {
            return SoundOptions;
        }

        public String getControlPrefereneces() {
            return ControlPrefereneces;
        }
    }
}
