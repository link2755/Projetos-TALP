package main;
import cyanruntime.*;

import cyan.lang.*;


@SuppressWarnings( { "unused", "cast", "hiding" } )
public final class _Json extends _Any
 {

	private static final long serialVersionUID = 2818666928311906551L;
    static { 
        try {

          _Json.prototype = new _Json();
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
    private     cyan.lang.CyInt _ident;

    public     _Json() {

    this._ident = (new CyInt( (int ) 4));

        } 

    public main._Json _new() {
         
            return new _Json();        
        } 

    public void  _setDefaultIdent_1( CyInt _ident )  {
        /* self.ident = ident */
        this._ident = _ident;
        return ;
        } 

    public CyInt _getDefaultIdent() {

        return _ident;
        } 

    public CyString  _toJson_1( _Any _obj )  {

        CyString _json;
        _json = (new CyString("{\n"));
        _Array_LT_GP_CyString_GT tmp437 = new _Array_LT_GP_CyString_GT( new CyInt(3) );
        tmp437._add_1( (new CyString("getFeatureListNameDoesNotCollide__")));
        tmp437._add_1( (new CyString("getAnnotListNameDoesNotCollide__")));
        tmp437._add_1( (new CyString("getSlotFeatureListNameDoesNotCollide__")));

        _Array_LT_GP_CyString_GT _excludedGets;
        _excludedGets = tmp437;
            {
            CyString _methodSignature;
            _Array_LT_GP_CyString_GT tmp438 = _obj._getMethodNameList();
            _Iterator_LT_GP_CyString_GT tmp439 = tmp438._iterator();
            while ( tmp439._hasNext().b ) { 
                _methodSignature = tmp439._next();
                CyBoolean tmp440 = _methodSignature._startsWith_1( (new CyString("get")));
                if ( tmp440.b ) {
                    CyString tmp441 = this.___getMethodName_1( _methodSignature);

                    CyString _methodName;
                    _methodName = tmp441;
                    CyBoolean tmp442 = _methodName._notin_1( _excludedGets);
                    if ( tmp442.b ) {
                        String tmp444 =  CyanRuntime.getJavaNameOfUnaryMethod(((CyString ) _methodName).s);
                        java.lang.reflect.Method tmp445 = CyanRuntime.getJavaMethodByName(_obj.getClass(), tmp444, 0);
                        if ( tmp445 == null ) { tmp445 = CyanRuntime.getJavaMethodByName(_obj.getClass(), "_methodName", 0); }
                        Object tmp446 = null;
                        if ( tmp445 != null ) { 
                            try {
                                tmp445.setAccessible(true);
                                if ( tmp445.getReturnType() == void.class ) {
                                    tmp446 = _Nil.prototype;
                                    tmp445.invoke(_obj);
                                }
                                else {
                                    tmp446 = tmp445.invoke(_obj);
                                }
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp447 ) {
                            	Throwable t__ = tmp447.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp447) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(_methodName ) );
                            }
                        }
                        else { 
                            //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                            java.lang.reflect.Method tmp448 = CyanRuntime.getJavaMethodByName(_obj.getClass(), "_doesNotUnderstand_2", 2);
                            if ( tmp448 == null ) {
                                throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                            }
                            try {
                                _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                arrayArrayParam._add_1( arrayParam );
                                tmp448.setAccessible(true);
                                tmp446 = tmp448.invoke(_obj, _methodName, arrayArrayParam);
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp449 ) {
                            	Throwable t__ = tmp449.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp449) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp444) ) );
                            }
                        }

                        Object _value;
                        _value = tmp446;
                    }
                    // end of if
                }
                // end of if
            }
        }
        /* json = json ++ "}" */
        CyString tmp450 = _json._plus_plus( (new CyString("}")));
        _json = tmp450;

        return _json;
        } 

    public CyString  ___getMethodName_1( CyString _methodSignature )  {
        CyInt tmp451 = _methodSignature._indexOf_1( (new CyChar(':')));

        CyInt _indexDoubleDot;
        _indexDoubleDot = tmp451;
        CyBoolean tmp452 = _indexDoubleDot._greaterThan_equal( CyInt.zero);
        if ( tmp452.b ) {

            return (new CyString(""));
        }
        // end of if
        CyInt tmp453 = _methodSignature._indexOf_1( (new CyChar(' ')));

        CyInt _indexWhiteSpace;
        _indexWhiteSpace = tmp453;
        CyBoolean tmp454 = _indexWhiteSpace._lessThan_equal( CyInt.zero);
        if ( tmp454.b ) {

            return (new CyString(""));
        }
        // end of if
        CyString tmp455 = _methodSignature._substring_2( CyInt.zero, _indexWhiteSpace);

        return tmp455;
        } 

    public @Override main._Json _prototype() {
         return prototype;
        
        } 

    public @Override main._Json _clone() {
        
        try {
            return (_Json ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp456 = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        return tmp456;
        } 

    public @Override _Array_LT_GP__Any_GT _getAnnotListNameDoesNotCollide____() {
        _Array_LT_GP__Any_GT tmp457 = new _Array_LT_GP__Any_GT();

        return tmp457;
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getSlotFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp458 = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _slotFeatureList__name__does__not__collide____;
        _slotFeatureList__name__does__not__collide____ = tmp458;

        return _slotFeatureList__name__does__not__collide____;
        } 
    public static _Json prototype;

    static final String []fieldList = { "ident" };
    static final String []fieldTypeList = { "cyan.lang.Int" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureList = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotList = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureList = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameList = { 
        new CyString("setDefaultIdent: Int -> Nil"),
        new CyString("getDefaultIdent -> Int"),
        new CyString("toJson: Any -> String"),
        new CyString("_getMethodName: String -> String"),
        new CyString("prototype -> main.Json"),
        new CyString("clone -> main.Json"),
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
        String s =  "Json {\n";
        s = s + "super(Any):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "ident: " + _ident._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Any.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Json";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureList; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureList; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotList; }
    static {
    }

}
