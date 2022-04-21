package model;

import java.sql.Timestamp;

public class BoardDTO {

private int	bNo;
private String	bTitle;
private String	bContent;
private String	bWriter;
private Timestamp	bRegDate;
/**
 * @return the bNo
 */
public int getbNo() {
	return bNo;
}
/**
 * @param bNo the bNo to set
 */
public void setbNo(int bNo) {
	this.bNo = bNo;
}
/**
 * @return the bTitle
 */
public String getbTitle() {
	return bTitle;
}
/**
 * @param bTitle the bTitle to set
 */
public void setbTitle(String bTitle) {
	this.bTitle = bTitle;
}
/**
 * @return the bContent
 */
public String getbContent() {
	return bContent;
}
/**
 * @param bContent the bContent to set
 */
public void setbContent(String bContent) {
	this.bContent = bContent;
}
/**
 * @return the bWriter
 */
public String getbWriter() {
	return bWriter;
}
/**
 * @param bWriter the bWriter to set
 */
public void setbWriter(String bWriter) {
	this.bWriter = bWriter;
}
/**
 * @return the bRegDate
 */
public Timestamp getbRegDate() {
	return bRegDate;
}
/**
 * @param bRegDate the bRegDate to set
 */
public void setbRegDate(Timestamp bRegDate) {
	this.bRegDate = bRegDate;
}
@Override
public String toString() {
	return "BoardDTO [bNo=" + bNo + ", bTitle=" + bTitle + ", bContent=" + bContent + ", bWriter=" + bWriter
			+ ", bRegDate=" + bRegDate + "]";
}




}
