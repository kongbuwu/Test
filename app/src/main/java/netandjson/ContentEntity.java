package netandjson;

import java.io.Serializable;

public class ContentEntity implements Serializable{

	private String stitle;
	private String sdate;
	private String type;
	private String url;
	private String id;
	private String imgsrc;
	private String imgsrc2;
	private int comment_num;

	public ContentEntity() {

	}

	public String getStitle() {
		return stitle;
	}

	public void setStitle(String stitle) {
		this.stitle = stitle;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImgsrc() {
		return imgsrc;
	}

	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}

	public String getImgsrc2() {
		return imgsrc2;
	}

	public void setImgsrc2(String imgsrc2) {
		this.imgsrc2 = imgsrc2;
	}

	public int getComment_num() {
		return comment_num;
	}

	public void setComment_num(int comment_num) {
		this.comment_num = comment_num;
	}

}
