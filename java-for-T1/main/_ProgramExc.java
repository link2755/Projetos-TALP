package main;
import cyanruntime.*;

import cyan.lang.*;


@SuppressWarnings( { "unused", "cast", "hiding" } )
public class _ProgramExc extends _Any
 {

	private static final long serialVersionUID = -8773338067738857965L;
    static { 
        try {

          _ProgramExc.prototype = new _ProgramExc();
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

    public     _ProgramExc() {

        } 

    public main._ProgramExc _new() {
         
            return new _ProgramExc();        
        } 

    public void _run() {
        CyBoolean tmp535 = CyBoolean.cyFalse;

        CyBoolean _k;
        _k = tmp535;
        _CatchStrCast _myCatch;
        if ( _k.b ) {
            /* myCatch = CatchStrCast */
            _myCatch = _CatchStrCast.prototype;
        }
        else {
            /* myCatch = SoftCatchStrCast */
            _myCatch = _SoftCatchStrCast.prototype;
        }
        // end of if

        CyInt _n;
        _n = (new CyInt( (int ) 20));
        try {
            CyBoolean tmp537 = _n._lessThan_equal( CyInt.zero);
            if ( tmp537.b ) {
                _ExceptionStr tmp538 = new _ExceptionStr( (new CyString("Num <= 0")));
                throw new ExceptionContainer__(tmp538);
            }
            // end of if
            CyBoolean tmp539 = _n._greaterThan_equal( (new CyInt( (int ) 13)));
            if ( tmp539.b ) {
                _ExceptionCast tmp540 = new _ExceptionCast( (new CyString("number cannot be month")));
                throw new ExceptionContainer__(tmp540);
            }
            // end of if
        }
        catch (ExceptionContainer__ t) {
            Object []tmp536 = new Object[1];
            tmp536[0] = _myCatch;
            CyanRuntime.catchException(tmp536,  t);
        }
        _Fun__0____ tmp541 = new _Fun__0____(this);

        _Function_LT_GP__ExceptionStr_GP__Nil_GT _exc;
        _exc = tmp541;
        _ExceptionStr tmp543 = new _ExceptionStr( (new CyString("An exception was thrown.")));
        _Nil tmp542 = _Nil.prototype;
        _exc._eval_1( tmp543);
        return ;
        } 

    public @Override main._ProgramExc _prototype() {
         return prototype;
        
        } 

    public @Override main._ProgramExc _clone() {
        
        try {
            return (_ProgramExc ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp544 = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        return tmp544;
        } 

    public @Override _Array_LT_GP__Any_GT _getAnnotListNameDoesNotCollide____() {
        _Array_LT_GP__Any_GT tmp545 = new _Array_LT_GP__Any_GT();

        return tmp545;
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getSlotFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp546 = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _slotFeatureList__name__does__not__collide____;
        _slotFeatureList__name__does__not__collide____ = tmp546;

        return _slotFeatureList__name__does__not__collide____;
        } 
    public static _ProgramExc prototype;
    private static _Fun__0____ prototypeFun_0__;

    static final String []fieldListFun_0__ = {  };
    static final String []fieldTypeListFun_0__ = {  };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureListFun_0__ = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotListFun_0__ = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureListFun_0__ = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameListFun_0__ = { 
        new CyString("eval: ExceptionStr -> Nil"),
        new CyString("clone -> main.Fun_0__"),
        new CyString("prototype -> main.Fun_0__")
        };


    static final String []fieldList = {  };
    static final String []fieldTypeList = {  };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureList = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotList = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureList = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameList = { 
        new CyString("run -> Nil"),
        new CyString("prototype -> main.ProgramExc"),
        new CyString("clone -> main.ProgramExc"),
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
    
    @SuppressWarnings( { "unused", "cast", "hiding" } )
private class _Fun__0____ extends cyan.lang._Function_LT_GP__ExceptionStr_GP__Nil_GT
 {

	private static final long serialVersionUID = 8886654447734910976L;
        public _Fun__0____(NonExistingJavaClass doNotExit) {
            super();
        }
        private         main._ProgramExc _self____;
        public _Fun__0____() { }

        public         _Fun__0____(main._ProgramExc _self____)  {

            
        this._self____ = _self____;
        
            } 

        public _Fun__0____  _new_1( main._ProgramExc _self____ )  {
             
            return new _Fun__0____(_self____);
        
            } 

        public @Override void  _eval_1( _ExceptionStr _e )  {
            CyString tmp548 = _e._message();
            _Nil tmp547 = _Nil.prototype;
            tmp548._println();
            return ;
            } 

        public @Override _Fun__0____ _clone() {
            
        try {
            return (_Fun__0____ ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
            } 

        public @Override _Fun__0____ _prototype() {
             return prototypeFun_0__;
        
            } 
    public String []getFieldTypeList() { 
        return fieldTypeListFun_0__;
    }
    public String []getFieldList() { 
        return fieldListFun_0__;
    }
    public String asString(int ident) {
        String s =  "Fun_0__ {\n";
        s = s + "super(cyan.lang.Function<ExceptionStr,Nil>):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "self__: " + _self____._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Function_LT_GP__ExceptionStr_GP__Nil_GT.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Fun_0__";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureListFun_0__; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureListFun_0__; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotListFun_0__; }

}

    public String []getFieldTypeList() { 
        return fieldTypeList;
    }
    public String []getFieldList() { 
        return fieldList;
    }
    public String asString(int ident) {
        String s =  "ProgramExc {\n";
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
    static final String prototypeName = "ProgramExc";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureList; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureList; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotList; }
    static {
    }

}
