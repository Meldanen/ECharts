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

package com.github.abel533.echarts.feature;

/**
 * @author liuzh
 */
public class DataView extends Feature {

	private String buttonColor;
	private String buttonTextColor;
	private Object optionToContent;
	private Object backgroundColor;

	/**
	 * 构造函数
	 */
	public DataView() {
		this.show(true);
		this.title("数据视图");
		this.readOnly(false);
		this.lang(new String[]{"数据视图", "关闭", "刷新"});
		this.buttonColor("#c23531");
		this.buttonTextColor("#fff");
	}

	public String buttonColor() {
		return this.buttonColor;
	}

	/**
	 * @param buttonColor
	 */
	public DataView buttonColor(String buttonColor) {
		this.buttonColor = buttonColor;
		return this;
	}

	public String buttonTextColor() {
		return this.buttonTextColor;
	}

	/**
	 *
	 * @param buttonTextColor
	 */
	public DataView buttonTextColor(String buttonTextColor) {
		this.buttonTextColor = buttonTextColor;
		return this;
	}

	public Object optionToContent() {
		return this.optionToContent;
	}

	/**
	 *
	 * @param optionToContent
	 */
	public DataView optionToContent(Object optionToContent) {
		this.optionToContent = optionToContent;
		return this;
	}

	public Object backgroundColor() {
		return this.backgroundColor;
	}

	/**
	 *
	 * @param backgroundColor
	 */
	public Object backgroundColour(Object backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

}
