package com.markerhub.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2022-09-30 10:11
 */
@Data
public class Result implements Serializable {
        private String code;
        private String msg;
        private Object data;
        public static Result succ(Object data) {
             Result m = new Result();
             m.setCode("200");
             m.setData(data);
             m.setMsg("操作成功");
             return m;
        }
        public static Result succ(String mess, Object data) {
             Result m = new Result();
             m.setCode("200");
             m.setData(data);
             m.setMsg(mess);
             return m;
        }
         public static Result fail(String mess) {
             Result m = new Result();
             m.setCode("400");
             m.setData(null);
             m.setMsg(mess);
             return m;
         }
         public static Result fail(String mess, Object data) {
             Result m = new Result();
             m.setCode("-1");
             m.setData(data);
             m.setMsg(mess);
             return m;
         }
         public static Result fail(String code,String mess, Object data) {
             Result m = new Result();
             m.setCode(code);
             m.setData(data);
             m.setMsg(mess);
             return m;
         }
}
