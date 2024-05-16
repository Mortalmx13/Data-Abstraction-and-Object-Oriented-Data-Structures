package activity4;

class SpecialTopicCourse  extends Course{
	String topic;
	public String getTopic() {
		return topic;
	}
	public void setTopic(String newTopic ) {
		topic = newTopic;
	}
	
	public SpecialTopicCourse(String courseNo, String title, String topic) {
		super(courseNo, title);
		this.topic = topic;
	}
	public SpecialTopicCourse(String courseNo, String title, String  topic, int credit) {
		super(courseNo, title, credit);
		this.topic = topic;
	}
	
    public String toString() {
    	return getcourse() +" - " + getTitle()+" (" + getCredit() +") " + topic;
    }
   
    public void printinfo() {
    	System.out.println(getcourse() +" - " + getTitle() + topic);
    }
    public boolean equals(Object obj) {
    	if (!(obj instanceof SpecialTopicCourse)) {
            return false;
        }
        return (topic == ((SpecialTopicCourse) obj).topic && getcourse() == ((SpecialTopicCourse) obj).getcourse());
    }
}
