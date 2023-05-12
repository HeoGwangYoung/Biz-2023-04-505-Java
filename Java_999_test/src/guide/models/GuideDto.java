package guide.models;

public class GuideDto {

	//id,종목명,순번,가이드
	public String guId;
	public String guName;
	public String guNum;
	public String guGuide;
	
	public GuideDto() {
		
	}

	public GuideDto(String guId, String guName, String guNum, String guGuide) {
		this.guId = guId;
		this.guName = guName;
		this.guNum = guNum;
		this.guGuide = guGuide;
	}

	@Override
	public String toString() {
		return "GuideDto [guId=" + guId + ", guName=" + guName + ", guNum=" + guNum + ", guGuide=" + guGuide + "]";
	}
	
}
