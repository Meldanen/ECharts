/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.abel533.echarts.style;

import com.github.abel533.echarts.style.itemstyle.Emphasis;
import com.github.abel533.echarts.style.itemstyle.Normal;

import java.io.Serializable;

/**
 * Description: ItemStyle
 *
 * @author liuzh
 */
public class ItemStyle implements Serializable {

    private static final long serialVersionUID = 418674375057055357L;

    /**
     * 阳线颜色
     */
    private Object color;
    /**
     * 阴线颜色
     */
    private Object color0;

    /**
     * 默认样式
     */
    private Normal normal;
    /**
     * 强调样式（悬浮时样式）
     */
    private Emphasis emphasis;
    /**
     * 面包屑
     */
    private Breadcrumb breadcrumb;
    /**
     * 二级边框宽度
     */
    private Integer borderWidth;
    /**
     * 二级边框颜色
     */
    private Object borderColor;
    
    private Object borderColor0;

    private Double opacity;
    
    /**
     * 获取normal值
     */
    public Normal normal() {
        if (this.normal == null) {
            this.normal = new Normal();
        }
        return this.normal;
    }

    /**
     * 设置normal值
     *
     * @param normal
     */
    public ItemStyle normal(Normal normal) {
        this.normal = normal;
        return this;
    }

    /**
     * 获取emphasis值
     */
    public Emphasis emphasis() {
        if (this.emphasis == null) {
            this.emphasis = new Emphasis();
        }
        return this.emphasis;
    }

    /**
     * 设置emphasis值
     *
     * @param emphasis
     */
    public ItemStyle emphasis(Emphasis emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    /**
     * 获取normal值
     */
    public Normal getNormal() {
        return normal;
    }

    //以下属性是TreeMap特有

    /**
     * 设置normal值
     *
     * @param normal
     */
    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    /**
     * 获取emphasis值
     */
    public Emphasis getEmphasis() {
        return emphasis;
    }

    /**
     * 设置emphasis值
     *
     * @param emphasis
     */
    public void setEmphasis(Emphasis emphasis) {
        this.emphasis = emphasis;
    }

    /**
     * 设置breadcrumb值
     *
     * @param breadcrumb
     */
    public ItemStyle breadcrumb(Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
        return this;
    }

    /**
     * 获取breadcrumb值
     */
    public Breadcrumb breadcrumb() {
        if (this.breadcrumb == null) {
            this.breadcrumb = new Breadcrumb();
        }
        return this.breadcrumb;
    }

    /**
     * 设置borderWidth值
     *
     * @param borderWidth
     */
    public ItemStyle borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * 获取borderWidth值
     */
    public Integer borderWidth() {
        return this.borderWidth;
    }

    /**
     * 设置borderColor值
     *
     * @param borderColor
     */
    public ItemStyle borderColor(Object borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * 获取borderColor值
     */
    public Object borderColor() {
        return this.borderColor;
    }
    
    public ItemStyle borderColor0(Object borderColor0) {
        this.borderColor0 = borderColor0;
        return this;
    }
    
    public Object borderColor0() {
        return this.borderColor0;
    }

    /**
     * 获取breadcrumb值
     */
    public Breadcrumb getBreadcrumb() {
        return breadcrumb;
    }

    /**
     * 设置breadcrumb值
     *
     * @param breadcrumb
     */
    public void setBreadcrumb(Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    /**
     * 获取borderWidth值
     */
    public Integer getborderWidth() {
        return borderWidth;
    }

    /**
     * 设置borderWidth值
     *
     * @param borderWidth
     */
    public void setborderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    /**
     * 获取borderColor值
     */
    public Object getborderColor() {
        return borderColor;
    }
    
    public Object getborderColor0() {
        return borderColor0;
    }

    /**
     * 设置borderColor值
     *
     * @param borderColor
     */
    public void setborderColor(Object borderColor) {
        this.borderColor = borderColor;
    }
    
    public void setborderColor0(Object borderColor0) {
        this.borderColor0 = borderColor0;
    }

    /**
     * 获取color值
     */
    public Object color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public ItemStyle color(Object color) {
        this.color = color;
        return this;
    }

    /**
     * 获取color0值
     */
    public Object color0() {
        return this.color0;
    }

    /**
     * 设置color0值
     *
     * @param color0
     */
    public ItemStyle color0(Object color0) {
        this.color0 = color0;
        return this;
    }

    /**
     * 获取color值
     */
    public Object getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(Object color) {
        this.color = color;
    }

    /**
     * 获取color0值
     */
    public Object getColor0() {
        return color0;
    }

    /**
     * 设置color0值
     *
     * @param color0
     */
    public void setColor0(Object color0) {
        this.color0 = color0;
    }
    
    public Double opacity() {
        return this.opacity;
    }

    public ItemStyle opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }
}
