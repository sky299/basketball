package com.app.support;

import com.app.mapper.WxClassStudentMapper;
import com.app.mapper.WxStudentMapper;
import com.jckj.model.TRClassStudent;
import com.jckj.model.TStudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WxStudentSupport {

    @Autowired
    private WxStudentMapper wxStudentMapper;

    @Autowired
    private WxClassStudentMapper wxClassStudentMapper;

    /**
     * 获取学员姓名
     * @param studentId
     * @return
     */
    public String getStudentName(Integer studentId) {
        TStudentInfo tStudentInfo = wxStudentMapper.info(studentId);
        return tStudentInfo.getStudentName();
    }

    /**
     * 获取学员的剩余课时
     * @param studentId
     * @return
     */
    public Integer getStudentCourseNum(Integer studentId){
        TRClassStudent trClassStudent = wxClassStudentMapper.infoByStudentId(studentId);
        return trClassStudent.getStudentCourseNum();
    }

    /**
     * 增加学员课时
     * @param studentId
     */
    public void addStudentCourseNum(Integer studentId) {
        TRClassStudent trClassStudent = wxClassStudentMapper.infoByStudentId(studentId);
        trClassStudent.setStudentCourseNum(trClassStudent.getStudentCourseNum() + 1);
        trClassStudent.setUpdateTime(System.currentTimeMillis());
        wxClassStudentMapper.update(trClassStudent);
    }

    /**
     * 减少学员课时
     * @param studentId
     */
    public void reduceStudentCourseNum(Integer studentId){
        TRClassStudent trClassStudent = wxClassStudentMapper.infoByStudentId(studentId);
        trClassStudent.setStudentCourseNum(trClassStudent.getStudentCourseNum() - 1);
        trClassStudent.setUpdateTime(System.currentTimeMillis());
        wxClassStudentMapper.update(trClassStudent);
    }
}
