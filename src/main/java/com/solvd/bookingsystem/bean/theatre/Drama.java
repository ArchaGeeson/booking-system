package com.solvd.bookingsystem.bean.theatre;

public class Drama extends Entertainment {
	private String title;
	private String writer;
	private String leadActor;

	public Drama() {

	}

	public Drama(String genre) {
		super(genre);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((leadActor == null) ? 0 : leadActor.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drama other = (Drama) obj;
		if (leadActor == null) {
			if (other.leadActor != null)
				return false;
		} else if (!leadActor.equals(other.leadActor))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Drama [title=" + title + ", writer=" + writer + ", leadActor=" + leadActor + "]";
	}
	
	
}
