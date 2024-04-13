package com.iims.placementcellservice.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.iims.placementcellservice.entity.Student;
import com.iims.placementcellservice.model.StudentDto;
import org.mapstruct.Mapper;

@Mapper
@JsonIgnoreProperties(ignoreUnknown = true)
public interface StudentMapper {

    Student toStudent(StudentDto studentDto);
}
