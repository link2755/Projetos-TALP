package main;
import cyanruntime.*;

import cyan.lang.*;


@SuppressWarnings( { "unused", "cast", "hiding" } )
public final class _Dummy extends _Any
 {

	private static final long serialVersionUID = -3618007724482940583L;
    static { 
        try {

          _Dummy.prototype = new _Dummy();
        }
        catch ( ExceptionInInitializerError e ) {
            System.out.println("Probably this prototype is referenced indirectly in a method called " + 
"in its 'init' method. This " + 
"happens in this example:\n" + 
"    object InitError\n" + 
"        func init { \n" + 
"            MakeError accessInitError;\n" + 
"        }\n" + 
"    end\n" + 
"Method 'accessInitError' is just\n" + 
"    func accessInitError { \n" + 
"        InitError prototypeName println; \n" + 
"    }\n" + 
"Then InitError is referenced before the 'init' " + 
"method has built the object that represents the " + 
"prototype"); 
       }

    }

    public     _Dummy() {

        } 

    public main._Dummy _new() {
         
            return new _Dummy();        
        } 

    public CyString  _toJson_1( _Any _obj )  {

        CyString _json;
        _json = (new CyString("{\n"));
        _Array_LT_GP_CyString_GT tmp415 = new _Array_LT_GP_CyString_GT( new CyInt(3) );
        tmp415._add_1( (new CyString("getFeatureListNameDoesNotCollide__")));
        tmp415._add_1( (new CyString("getAnnotListNameDoesNotCollide__")));
        tmp415._add_1( (new CyString("getSlotFeatureListNameDoesNotCollide__")));

        _Array_LT_GP_CyString_GT _excludedGets;
        _excludedGets = tmp415;
            {
            CyString _methodSignature;
            _Array_LT_GP_CyString_GT tmp416 = _obj._getMethodNameList();
            _Iterator_LT_GP_CyString_GT tmp417 = tmp416._iterator();
            while ( tmp417._hasNext().b ) { 
                _methodSignature = tmp417._next();
                CyBoolean tmp418 = _methodSignature._startsWith_1( (new CyString("get")));
                if ( tmp418.b ) {
                    CyString tmp419 = this.___getMethodName_1( _methodSignature);

                    CyString _methodName;
                    _methodName = tmp419;
                    CyBoolean tmp420 = _methodName._notin_1( _excludedGets);
                    if ( tmp420.b ) {
                        String tmp422 =  CyanRuntime.getJavaNameOfUnaryMethod(((CyString ) _methodName).s);
                        java.lang.reflect.Method tmp423 = CyanRuntime.getJavaMethodByName(_obj.getClass(), tmp422, 0);
                        if ( tmp423 == null ) { tmp423 = CyanRuntime.getJavaMethodByName(_obj.getClass(), "_methodName", 0); }
                        Object tmp424 = null;
                        if ( tmp423 != null ) { 
                            try {
                                tmp423.setAccessible(true);
                                if ( tmp423.getReturnType() == void.class ) {
                                    tmp424 = _Nil.prototype;
                                    tmp423.invoke(_obj);
                                }
                                else {
                                    tmp424 = tmp423.invoke(_obj);
                                }
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp425 ) {
                            	Throwable t__ = tmp425.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp425) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(_methodName ) );
                            }
                        }
                        else { 
                            //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                            java.lang.reflect.Method tmp426 = CyanRuntime.getJavaMethodByName(_obj.getClass(), "_doesNotUnderstand_2", 2);
                            if ( tmp426 == null ) {
                                throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                            }
                            try {
                                _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                arrayArrayParam._add_1( arrayParam );
                                tmp426.setAccessible(true);
                                tmp424 = tmp426.invoke(_obj, _methodName, arrayArrayParam);
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp427 ) {
                            	Throwable t__ = tmp427.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp427) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp422) ) );
                            }
                        }

                        Object _value;
                        _value = tmp424;
                    }
                    // end of if
                }
                // end of if
            }
        }
        /* json = json ++ "}" */
        CyString tmp428 = _json._plus_plus( (new CyString("}")));
        _json = tmp428;

        return _json;
        } 

    public CyString  ___getMethodName_1( CyString _methodSignature )  {
        CyInt tmp429 = _methodSignature._indexOf_1( (new CyChar(':')));

        CyInt _indexDoubleDot;
        _indexDoubleDot = tmp429;
        CyBoolean tmp430 = _indexDoubleDot._greaterThan_equal( CyInt.zero);
        if ( tmp430.b ) {

            return (new CyString(""));
        }
        // end of if
        CyInt tmp431 = _methodSignature._indexOf_1( (new CyChar(' ')));

        CyInt _indexWhiteSpace;
        _indexWhiteSpace = tmp431;
        CyBoolean tmp432 = _indexWhiteSpace._lessThan_equal( CyInt.zero);
        if ( tmp432.b ) {

            return (new CyString(""));
        }
        // end of if
        CyString tmp433 = _methodSignature._substring_2( CyInt.zero, _indexWhiteSpace);

        return tmp433;
        } 

    public CyString _getSomething1() {
        return (new CyString("sjfnednfs"));
        } 

    public @Override main._Dummy _prototype() {
         return prototype;
        
        } 

    public @Override main._Dummy _clone() {
        
        try {
            return (_Dummy ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp434 = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        return tmp434;
        } 

    public @Override _Array_LT_GP__Any_GT _getAnnotListNameDoesNotCollide____() {
        _Array_LT_GP__Any_GT tmp435 = new _Array_LT_GP__Any_GT();

        return tmp435;
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getSlotFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp436 = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _slotFeatureList__name__does__not__collide____;
        _slotFeatureList__name__does__not__collide____ = tmp436;

        return _slotFeatureList__name__does__not__collide____;
        } 
    public static _Dummy prototype;

    static final String []fieldList = {  };
    static final String []fieldTypeList = {  };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureList = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotList = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureList = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameList = { 
        new CyString("toJson: Any -> String"),
        new CyString("_getMethodName: String -> String"),
        new CyString("getSomething1 -> String"),
        new CyString("prototype -> main.Dummy"),
        new CyString("clone -> main.Dummy"),
        new CyString("getFeatureListNameDoesNotCollide__ -> Array<Tuple<key,String,value,Any>>"),
        new CyString("getAnnotListNameDoesNotCollide__ -> Array<Any>"),
        new CyString("getSlotFeatureListNameDoesNotCollide__ -> Array<Tuple<slotName,String,key,String,value,Any>>")
        };
    @Override protected CyString [] getMethodNameList2() { return methodNameList; }
    @Override protected String [] getFieldList2() { return fieldList; }

    private CyBoolean _eq_1_super__( Object p0 ) { return super._eq_1( p0 ); }
    private CyBoolean _neq_1_super__( Object p0 ) { return super._neq_1( p0 ); }
    private _Any _prototype_super__() { return super._prototype(); }
    private CyString _prototypeName_super__() { return super._prototypeName(); }
    private _Any _prototypeParent_super__() { return super._prototypeParent(); }
    private CyString _prototypePackageName_super__() { return super._prototypePackageName(); }
    private CyBoolean _isInterface_super__() { return super._isInterface(); }
    private CyBoolean _isA_1_super__( _Any p0 ) { return super._isA_1( p0 ); }
    private CyBoolean _notIsA_1_super__( _Any p0 ) { return super._notIsA_1( p0 ); }
    private Object _throw_1_super__( _CyException p0 ) { return super._throw_1( p0 ); }
    private _Any _clone_super__() { return super._clone(); }
    private CyString _plus_plus_super__(_Any _other) { return super._plus_plus(_other); }
    private CyString _asString_super__() { return super._asString(); }
    private CyString _asString_1_super__( CyInt p0 ) { return super._asString_1( p0 ); }
    private CyString _asStringThisOnly_1_super__( CyInt p0 ) { return super._asStringThisOnly_1( p0 ); }
    private CyString _asStringQuoteIfString_super__() { return super._asStringQuoteIfString(); }
    private CyBoolean _equal_equal_super__(Object _other) { return super._equal_equal(_other); }
    private CyBoolean _equal_equal_equal_super__(Object _other) { return super._equal_equal_equal(_other); }
    private CyBoolean _exclamation_equal_equal_super__(Object _other) { return super._exclamation_equal_equal(_other); }
    private CyBoolean _exclamation_equal_super__(Object _other) { return super._exclamation_equal(_other); }
    private CyBoolean _isCase_1_super__( _Any p0 ) { return super._isCase_1( p0 ); }
    private void _assertxx_1_super__( CyBoolean p0 ) { super._assertxx_1( p0 ); }
    private void _assertxx_2_super__( CyBoolean p0, CyString p1 ) { super._assertxx_2( p0, p1 ); }
    private void _print_super__() { super._print(); }
    private void _println_super__() { super._println(); }
    private void _printspc_super__() { super._printspc(); }
    private void _printc_super__() { super._printc(); }
    private _Any _toAny_1_super__( Object p0 ) { return super._toAny_1( p0 ); }
    private _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _featureList_super__() { return super._featureList(); }
    private _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _featureList_1_super__( CyString p0 ) { return super._featureList_1( p0 ); }
    private _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _slotFeatureList_super__() { return super._slotFeatureList(); }
    private _Array_LT_GP__Any_GT _annotList_super__() { return super._annotList(); }
    private _Array_LT_GP__Any_GT _annotList_1_super__( CyString p0 ) { return super._annotList_1( p0 ); }
    private Object _doesNotUnderstand_2_super__( CyString p0, _Array_LT_GP__Array_LT_GP_Object_GT_GT p1 ) { return super._doesNotUnderstand_2( p0, p1 ); }
    private _Any _functionForMethod_1_super__( CyString p0 ) { return super._functionForMethod_1( p0 ); }
    private _Any _functionForMethodWithSelf_1_super__( CyString p0 ) { return super._functionForMethodWithSelf_1( p0 ); }
    private CyInt _hashCode_super__() { return super._hashCode(); }
    private _Array_LT_GP_CyString_GT _getMethodNameList_super__() { return super._getMethodNameList(); }
    private _Array_LT_GP_CyString_GT _getFieldNameList_super__() { return super._getFieldNameList(); }
    private _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getFeatureListNameDoesNotCollide_____super__() { return super._getFeatureListNameDoesNotCollide____(); }
    private _Array_LT_GP__Any_GT _getAnnotListNameDoesNotCollide_____super__() { return super._getAnnotListNameDoesNotCollide____(); }
    private _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getSlotFeatureListNameDoesNotCollide_____super__() { return super._getSlotFeatureListNameDoesNotCollide____(); }
    public String []getFieldTypeList() { 
        return fieldTypeList;
    }
    public String []getFieldList() { 
        return fieldList;
    }
    public String asString(int ident) {
        String s =  "Dummy {\n";
        s = s + "super(Any):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        return s;
    } 
    protected _Any parent() {
        return _Any.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Dummy";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureList; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureList; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotList; }
    static {
    }

}
