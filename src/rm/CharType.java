/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm;

import java.util.Objects;

/**
 *
 * @author Maarten
 */
public class CharType extends Type{
    private Character value;
    public CharType(Character b)
    {
        this.value = b;
    }
    @Override
    public Character getValue() 
    {
        return value;
    }
    
    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CharType other = (CharType) obj;
        return Objects.equals(this.value, other.getValue());
    }

    public CharType checkObj(Type obj)
    {
        if (obj == null) {
            return null;
        }
        if (getClass() != obj.getClass()) {
            return null;
        }
        final CharType other = (CharType) obj;
        return other;
    }

    @Override
    public Boolean IsLessThan(Type obj) {
        CharType other = checkObj(obj);
        if(obj != null)
            return this.value < other.getValue();    
        else
            return false;
    }
    
    @Override
    public Boolean IsLessOrEqual(Type rightNumber) {
        CharType other = checkObj(rightNumber);
        if(rightNumber != null)
            return this.value <= other.getValue();    
        else
            return false;    
    }

    @Override
    public Boolean IsGreaterThan(Type rightNumber) {
        CharType other = checkObj(rightNumber);
        if(rightNumber != null)
            return this.value > other.getValue();    
        else
            return false;    
    }

    @Override
    public Boolean IsGreaterOrEqual(Type rightNumber) {
        CharType other = checkObj(rightNumber);
        if(rightNumber != null)
            return this.value >= other.getValue();    
        else
            return false;    
    }

    @Override
    public Type add(Type other) {
        CharType obj = checkObj(other);
        if(obj != null){
            return new CharType((char)(this.value + obj.getValue()));
        }
        if(other.getClass().getName().equals(IntegerType.class.getName()))
        {
            IntegerType i = (IntegerType)other;
            return new CharType((char)(this.value + i.getValue()));
        }
        throw new IllegalArgumentException("Cannot add " + other.getClass().getSimpleName() + " to a char");   
    }

    @Override
    public Type minus(Type other) {
        CharType obj = checkObj(other);
        if(obj != null){
            return new CharType((char)(this.value - obj.getValue()));
        }
        throw new IllegalArgumentException("Cannot substract " + other.getClass().getSimpleName() + " from a char");   
 
    }

    @Override
    public Type times(Type other) {
        throw new UnsupportedOperationException("Chars don't implement mathematical operators"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Type div(Type rightNumber) {
        throw new UnsupportedOperationException("Chars don't implement mathematical operators"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void negate() {
        throw new UnsupportedOperationException("Chars don't have an inverse"); //To change body of generated methods, choose Tools | Templates.
    }
}
