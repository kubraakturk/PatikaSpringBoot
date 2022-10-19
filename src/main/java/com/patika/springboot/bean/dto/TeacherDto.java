package com.patika.springboot.bean.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
public class TeacherDto {

    private Long teacherId;

    @NotEmpty(message = "ad soyad alanını boş geçemezsiniz")
    @Size(min=1,max=255)
    private String teacherNameSurname;

    @NotEmpty(message = "email alanını boş geçemezsiniz")
    @Email(message = "uygun formatta mail girmediniz")
    private String teacherEmail;

    @NotEmpty(message = "şifreyi boş geçemezsiniz")
    @Size(min=5,max=15)
    private String teacherPassword;
}
