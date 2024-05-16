//Charles Young
package assg2_youngch20;



public class ComplexNum {

	public double realNum = 0;
	public double imaginaryNum = 0;
	
	
	public ComplexNum() {
		realNum = 0;
		imaginaryNum = 0;
	}
public ComplexNum(double realN) {
	 this.realNum= realN;
		this.imaginaryNum = 0;
	}
public ComplexNum(double realN, double imaginaryN) {
	this.realNum = realN;
	this.imaginaryNum = imaginaryN;
}
/**
 * returns real value
 * @return
 */
public double getReal() {
	return realNum;
}
/**
 * returns imaginary number
 * @return
 */
public double getImaginary() {
	return imaginaryNum;
}
/**
 * sets the value of real number
 * @param real
 */
public void setReal(double real) {
	realNum = real;
}
/**
 * sets the value of imaginary number
 * @param imaginary
 */
public void setImaginary(double imaginary) {
	imaginaryNum = imaginary;
}
/**
 * adds together two different sets of numbers
 * @param obj
 * @return
 */
public ComplexNum add(ComplexNum obj) {
	obj.realNum = obj.realNum + this.realNum;
	obj.imaginaryNum = obj.imaginaryNum + this.imaginaryNum;
	
	return obj;
}
/**
 * subtracts one complex number from another
 * @param obj
 * @return
 */
public ComplexNum sub(ComplexNum obj) {
	obj.realNum = obj.realNum - this.realNum;
	obj.imaginaryNum = obj.imaginaryNum - this.imaginaryNum;
	
	return obj;
}
/**
 * multiply two complex numbers 
 * @param obj
 * @return
 */
public ComplexNum mul(ComplexNum obj) {
	obj.realNum = obj.realNum * this.realNum;
	obj.imaginaryNum = obj.imaginaryNum * this.imaginaryNum;
	
	return obj;
}
/**
 * turns a complex number negative
 * @return
 */
public ComplexNum neg() {
    ComplexNum obj = new ComplexNum(getReal()*-1,getImaginary()*-1);
    return obj;
}

@Override
/**
 * process of writing out what a complex number is supposed to look like
 */
public String toString() {
	
	if (getReal() == 0 ) {
		return getImaginary()+"i";
	}else if(getImaginary() == 0 ) {
		return getReal()+"";
	}
	else {
		if(getReal() > 0 && getImaginary() > 0) {
			return getReal() + "+" + getImaginary() + "i";
		}
		else {
			return getReal() +""+ getImaginary() + "i";
		}
	}
	
	
	

}
@Override
/**
 * checks if the two complex numbers are equal
 */
public boolean equals(Object obj) {
	if (obj instanceof Object)
	{
		Object newObj = (Object) obj;
		return this.getReal() == ((ComplexNum) newObj).getReal() && this.getImaginary() == ((ComplexNum) newObj).getImaginary();
	}
	
	return false;
	
}

}
