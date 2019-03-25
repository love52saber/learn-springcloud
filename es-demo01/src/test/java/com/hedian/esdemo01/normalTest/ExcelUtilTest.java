package com.hedian.esdemo01.normalTest;

import com.hedian.esdemo01.entity.Student;
import com.hedian.esdemo01.util.ExcelUtil;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Created by 和电科技 on 2019/3/25 17:03
 */
public class ExcelUtilTest {

    @Test
    public void test() {
        InputStream in = this.getClass().getClass().getResourceAsStream("/test.xls");
        List<Student> stuList = ExcelUtil.importDataFromExcel(Student.class, in, "test.xls");
        System.out.println(stuList);
    }


//    @Test
//    public void test() {
//
//        List<Student> stuList = ExcelUtil.exportDataToExcel();
//        System.out.println(stuList);
//    }
}
