package factory1;

public class VideoFactory {
	public Video getVideo(String type) {
		if ("java".equalsIgnoreCase(type)) {
			return new JavaVideo();
		}else if ("python".equalsIgnoreCase(type)) {
			return new PythonVideo();
		}
		return null;
	}
	
	public static Video getVideo(Class clazz) {
		Video video=null;
		try {
			try {
				video=(Video)Class.forName(clazz.getName()).newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return video;
	}
}
