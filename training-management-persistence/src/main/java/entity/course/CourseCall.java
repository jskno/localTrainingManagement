package es.everis.training.entity.course;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import es.everis.training.entity.employee.Centro;

@Entity
@Table(name="COURSE_CALLS")
public class CourseCall {
	
	@Id
	@Column(name="COURSE_CALL_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long CourseCallId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COURSE_ID")
	private Course course;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COURSE_PLACE", referencedColumnName="ID")
	private Centro coursePlace;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COURSE_CALL_STATUS_ID", referencedColumnName="ID")
	private CourseCallStatus courseCallStatus;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INIT_DATE")
	private Date initDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="END_DATE")
	private Date endDate;
	
	@Temporal(TemporalType.TIME)
	@Column(name="INIT_TIME")
	private Date initTime;
	
	@Temporal(TemporalType.TIME)
	@Column(name="END_TIME")
	private Date endTime;
	
	private String notes;
	
	@Column(name="HAS_BREAK")
	private Boolean hasBreak;
	
	@Column(name="HAS_LUCH")
	private Boolean hasLunch;
	
	@Column(name="HAS_DOCUMENTATION")
	private Boolean hasDocumentation;
	
	@Column(name="ROOM_COST")
	private BigDecimal roomCost;
	
	@Column(name="TEACHER_COST")
	private BigDecimal teacherCost;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name="REMOVED_DATE")
	private Date removedDate;

	public Long getCourseCallId() {
		return CourseCallId;
	}

	public void setCourseCallId(Long courseCallId) {
		CourseCallId = courseCallId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Centro getCoursePlace() {
		return coursePlace;
	}

	public void setCoursePlace(Centro coursePlace) {
		this.coursePlace = coursePlace;
	}

	public CourseCallStatus getCourseCallStatus() {
		return courseCallStatus;
	}

	public void setCourseCallStatus(CourseCallStatus courseCallStatus) {
		this.courseCallStatus = courseCallStatus;
	}

	public Date getInitDate() {
		return initDate;
	}

	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getInitTime() {
		return initTime;
	}

	public void setInitTime(Date initTime) {
		this.initTime = initTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Boolean getHasBreak() {
		return hasBreak;
	}

	public void setHasBreak(Boolean hasBreak) {
		this.hasBreak = hasBreak;
	}

	public Boolean getHasLunch() {
		return hasLunch;
	}

	public void setHasLunch(Boolean hasLunch) {
		this.hasLunch = hasLunch;
	}

	public Boolean getHasDocumentation() {
		return hasDocumentation;
	}

	public void setHasDocumentation(Boolean hasDocumentation) {
		this.hasDocumentation = hasDocumentation;
	}

	public BigDecimal getRoomCost() {
		return roomCost;
	}

	public void setRoomCost(BigDecimal roomCost) {
		this.roomCost = roomCost;
	}

	public BigDecimal getTeacherCost() {
		return teacherCost;
	}

	public void setTeacherCost(BigDecimal teacherCost) {
		this.teacherCost = teacherCost;
	}

	public Date getRemovedDate() {
		return removedDate;
	}

	public void setRemovedDate(Date removedDate) {
		this.removedDate = removedDate;
	}
	
}
