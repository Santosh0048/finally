package javaPracticeNew;

//Immutable Degree Class
final class Degree {
	private final String course;
    private final String university;

    public Degree(String course, String university) {
        this.course = course;
        this.university = university;
    }

    public String getCourse() {
        return course;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String toString() {
        return "[course=" + course + ", university=" + university + "]";
    }
}


