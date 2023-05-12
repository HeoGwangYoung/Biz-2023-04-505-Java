package guide.exec;

import guide.service.GuideService;
import guide.service.impl.GuideServiceImplV1;

public class GuideExecA {

	public static void main(String[] args) {
		GuideService guideService = new GuideServiceImplV1();
		guideService.loadGuide();
		guideService.printGuideList();
	}
}
