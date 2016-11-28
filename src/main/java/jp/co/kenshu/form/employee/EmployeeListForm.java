package jp.co.kenshu.form.employee;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import jp.co.kenshu.validator.annotation.Memo;

//@Data
public class EmployeeListForm {
	@NotEmpty
    private String name;
	@NotNull
	@Min(18)
    private Integer age;
	@Memo(50)
    private String memo;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
