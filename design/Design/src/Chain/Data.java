package Chain;

public class Data {
    private boolean validated;
    private boolean Format;
    private boolean Size;
    private boolean info;

    public Data(boolean validated, boolean format, boolean size, boolean info) {
        this.validated = validated;
        Format = format;
        Size = size;
        this.info = info;
    }

    public boolean isFormat() {
        return Format;
    }

    public void setFormat(boolean format) {
        Format = format;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public boolean isSize() {
        return Size;
    }

    public void setSize(boolean size) {
        Size = size;
    }

    public boolean isInfo() {
        return info;
    }

    public void setInfo(boolean info) {
        this.info = info;
    }
}

