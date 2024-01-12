package org.eu.bk201sama.base;

/**
 * 在 Java 中，所有的变量都必须先声明其数据类型。Java 的数据类型分为两大类：基本数据类型（Primitive Data Types）和引用数据类型（Reference Data Types）
 */
public class TypeOfData {
    /**
     * 基本数据类型
     */
    class PrimitiveDataType{
        //可以试一下，超过范围了会报错
        private byte basicDataTypeByte = 127;// 8位有符号整数,换成十进制-2^7~2^7-1  -128~127  (0占据了正数的一个位置)
        private short basicDataTypeShort = -11111;//16位有符号整数,换成十进制-2^15~2^15-1




    }

    /**
     *  这里定义了一个普通内部类。
     *  class Outer {
     *     class Inner {
     *         // 定义了一个Inner Class
     *     }
     * }
     *  Java的内部类可分为Inner Class、Anonymous Class和Static Nested Class三种
     *  PrimitiveDataType就是Inner Class，普通内部类，必须依附于Outer Class的实例，即TypeOfData实例化后才能访问到PrimitiveDataType。
     *  PrimitiveDataType拥有访问TypeOfData private 属性的权限
     */
}
