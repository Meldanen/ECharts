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

package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.code.AxisType;
import lombok.Getter;
import lombok.Setter;

/**
 * 值轴
 *
 * @author liuzh.
 */
@Getter
@Setter
public class ValueAxis extends Axis<ValueAxis> {
	/**
	 * 小数精度，默认为0，无小数点
	 */
	private Integer precision;
	/**
	 * 整数精度，默认为100，个位和百位为0
	 */
	private Integer power;
	/**
	 * 分割段数，默认为5
	 */
	private Integer splitNumber;

	/**
	 * 构造函数
	 */
	public ValueAxis() {
		this.type(AxisType.value);
	}

	/**
	 * 获取precision值
	 */
	public Integer precision() {
		return this.precision;
	}

	/**
	 * 设置precision值
	 *
	 * @param precision
	 */
	public ValueAxis precision(Integer precision) {
		this.precision = precision;
		return this;
	}

	/**
	 * 获取power值
	 */
	public Integer power() {
		return this.power;
	}

	/**
	 * 设置power值
	 *
	 * @param power
	 */
	public ValueAxis power(Integer power) {
		this.power = power;
		return this;
	}

	/**
	 * 获取splitNumber值
	 */
	public Integer splitNumber() {
		return this.splitNumber;
	}

	/**
	 * 设置splitNumber值
	 *
	 * @param splitNumber
	 */
	public ValueAxis splitNumber(Integer splitNumber) {
		this.splitNumber = splitNumber;
		return this;
	}

}
