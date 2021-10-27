package musementpark.online.blackboard;
/**
 * author:CaoHS
 * description:黑板控制类
 */
public class BlackboardController {
	
	private Blackboard blackboard;
	
	public BlackboardController( Blackboard blackboard) {
		this.blackboard = blackboard;
	}

	/**
	 * 展示黑板所有内容
	 */
	public void executeAll() {
		for (Resource resource : blackboard.resources) {
			resource.executeAction();			
		}
	}

	/**
	 * 新加一条黑板内容
	 * @param resource
	 */
	public void add(Resource resource){
		blackboard.resources.add(resource);
	}

	/**
	 * 删除一条黑板内容
	 * @param resource
	 */
	public void delete(Resource resource){
		blackboard.resources.remove(resource);
	}

	/**
	 * 修改一条黑板内容
	 * @param resource
	 */
	public void update(Resource resource,String newContent){
		resource.content=newContent;
	}
}
