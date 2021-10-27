package musementpark.online.blackboard;

import java.util.ArrayList;
import java.util.List;
/**
 * author:CaoHS
 * description:公示栏黑板类
 */
public class Blackboard {

	public List<Resource> resources;//黑板所有内容
	
	public Blackboard(Resource resource) {
		resources = new ArrayList<Resource>();
		resources.add(resource);
	}
}
