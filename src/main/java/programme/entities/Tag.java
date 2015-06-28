package programme.entities;

public class Tag {
    private String content;
    private boolean italic;
    private boolean bold;

    public Tag(String content, boolean italic, boolean bold) {
	this.content = content;
	this.italic = italic;
	this.bold = bold;
    }

    public String getContent() {
	return content;
    }

    public boolean isItalic() {
	return this.italic;
    }

    public boolean isBold() {
	return this.bold;
    }
}
