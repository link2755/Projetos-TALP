package main;
import cyanruntime.*;

import cyan.lang.*;


@SuppressWarnings( { "unused", "cast", "hiding" } )
public final class _Program extends _Any
 {

	private static final long serialVersionUID = -3424597554829409059L;
    static { 
        try {

          _Program.prototype = new _Program();
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
    private     cyan.lang._Any _d;

    public     _Program() {
    main._Dummy tmp459 = new main._Dummy( );

    this._d = tmp459;

        } 

    public main._Program _new() {
         
            return new _Program();        
        } 

    public void _run() {
        main._Program tmp461 = new main._Program( );
        CyString tmp460 = this._toJson_1( tmp461);

        CyString _j;
        _j = tmp460;
        _Nil tmp462 = _Nil.prototype;
        _Out.prototype._println_1( _j);
        return ;
        } 

    public CyString  _toJson_1( _Any _obj )  {

        CyString _json;
        _json = (new CyString("{\n"));
        _Array_LT_GP_CyString_GT tmp463 = new _Array_LT_GP_CyString_GT( new CyInt(3) );
        tmp463._add_1( (new CyString("getFeatureListNameDoesNotCollide__")));
        tmp463._add_1( (new CyString("getAnnotListNameDoesNotCollide__")));
        tmp463._add_1( (new CyString("getSlotFeatureListNameDoesNotCollide__")));

        _Array_LT_GP_CyString_GT _excludedGets;
        _excludedGets = tmp463;
            {
            CyString _methodSignature;
            _Array_LT_GP_CyString_GT tmp464 = _obj._getMethodNameList();
            _Iterator_LT_GP_CyString_GT tmp465 = tmp464._iterator();
            while ( tmp465._hasNext().b ) { 
                _methodSignature = tmp465._next();
                CyBoolean tmp466 = _methodSignature._startsWith_1( (new CyString("get")));
                if ( tmp466.b ) {
                    CyString tmp467 = this.___getMethodName_1( _methodSignature);

                    CyString _methodName;
                    _methodName = tmp467;
                    CyBoolean tmp468 = _methodName._notin_1( _excludedGets);
                    if ( tmp468.b ) {
                        String tmp470 =  CyanRuntime.getJavaNameOfUnaryMethod(((CyString ) _methodName).s);
                        java.lang.reflect.Method tmp471 = CyanRuntime.getJavaMethodByName(_obj.getClass(), tmp470, 0);
                        if ( tmp471 == null ) { tmp471 = CyanRuntime.getJavaMethodByName(_obj.getClass(), "_methodName", 0); }
                        Object tmp472 = null;
                        if ( tmp471 != null ) { 
                            try {
                                tmp471.setAccessible(true);
                                if ( tmp471.getReturnType() == void.class ) {
                                    tmp472 = _Nil.prototype;
                                    tmp471.invoke(_obj);
                                }
                                else {
                                    tmp472 = tmp471.invoke(_obj);
                                }
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp473 ) {
                            	Throwable t__ = tmp473.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp473) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(_methodName ) );
                            }
                        }
                        else { 
                            //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                            java.lang.reflect.Method tmp474 = CyanRuntime.getJavaMethodByName(_obj.getClass(), "_doesNotUnderstand_2", 2);
                            if ( tmp474 == null ) {
                                throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                            }
                            try {
                                _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                arrayArrayParam._add_1( arrayParam );
                                tmp474.setAccessible(true);
                                tmp472 = tmp474.invoke(_obj, _methodName, arrayArrayParam);
                            }
                            catch ( java.lang.reflect.InvocationTargetException tmp475 ) {
                            	Throwable t__ = tmp475.getCause();
                            	if ( t__ instanceof ExceptionContainer__ ) {
                                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                            	}
                            	else
                            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                            }
                            catch (IllegalAccessException | IllegalArgumentException tmp475) {
                                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp470) ) );
                            }
                        }

                        Object _value;
                        _value = tmp472;
                    }
                    // end of if
                }
                // end of if
            }
        }
        /* json = json ++ "}" */
        CyString tmp476 = _json._plus_plus( (new CyString("}")));
        _json = tmp476;

        return _json;
        } 

    public CyString  ___getMethodName_1( CyString _methodSignature )  {
        CyInt tmp477 = _methodSignature._indexOf_1( (new CyChar(':')));

        CyInt _indexDoubleDot;
        _indexDoubleDot = tmp477;
        CyBoolean tmp478 = _indexDoubleDot._greaterThan_equal( CyInt.zero);
        if ( tmp478.b ) {

            return (new CyString(""));
        }
        // end of if
        CyInt tmp479 = _methodSignature._indexOf_1( (new CyChar(' ')));

        CyInt _indexWhiteSpace;
        _indexWhiteSpace = tmp479;
        CyBoolean tmp480 = _indexWhiteSpace._lessThan_equal( CyInt.zero);
        if ( tmp480.b ) {

            return (new CyString(""));
        }
        // end of if
        CyString tmp481 = _methodSignature._substring_2( CyInt.zero, _indexWhiteSpace);

        return tmp481;
        } 

    public _Any _getSomething4() {
        return _d;
        } 

    public void _ex3() {
        main._Program tmp482 = new main._Program( );

        main._Program _p;
        _p = tmp482;
            {
            CyString _methodSignature;
            _Array_LT_GP_CyString_GT tmp483 = _p._getMethodNameList();
            _Iterator_LT_GP_CyString_GT tmp484 = tmp483._iterator();
            while ( tmp484._hasNext().b ) { 
                _methodSignature = tmp484._next();
                _Nil tmp485 = _Nil.prototype;
                _methodSignature._println();
            }
        }
        return ;
        } 

    public void _ex2() {
            {
            CyString _op;
            _Array_LT_GP_CyString_GT tmp486 = new _Array_LT_GP_CyString_GT( new CyInt(4) );
            tmp486._add_1( (new CyString("+")));
            tmp486._add_1( (new CyString("-")));
            tmp486._add_1( (new CyString("*")));
            tmp486._add_1( (new CyString("/")));
            _Iterator_LT_GP_CyString_GT tmp487 = tmp486._iterator();
            while ( tmp487._hasNext().b ) { 
                _op = tmp487._next();
                    {
                    CyInt _a;
                    _Interval_LT_GP_CyInt_GT tmp488 = CyInt.one._dot_dot( (new CyInt( (int ) 10)));
                    _Iterator_LT_GP_CyInt_GT tmp489 = tmp488._iterator();
                    while ( tmp489._hasNext().b ) { 
                        _a = tmp489._next();
                            {
                            CyInt _b;
                            _Interval_LT_GP_CyInt_GT tmp490 = CyInt.one._dot_dot( (new CyInt( (int ) 10)));
                            _Iterator_LT_GP_CyInt_GT tmp491 = tmp490._iterator();
                            while ( tmp491._hasNext().b ) { 
                                _b = tmp491._next();
                                CyDouble tmp493 = _a._asDouble();
                                CyDouble tmp495 = _b._asDouble();
                                String tmp496 = "";
                                tmp496 += ((CyString ) _op).s;
                                char tmp497 = tmp496.charAt(0);
                                if ( (tmp497 == '_' || Character.isAlphabetic(tmp497) ) && !tmp496.endsWith(":") ) { tmp496 += ":"; }
                                String tmp498 =  CyanRuntime.getJavaNameOfMethod(new String[] { ((CyString ) _op).s }, new int[] {1} );
                                java.lang.reflect.Method tmp499 = null;
                                tmp499 = CyanRuntime.getJavaMethodByName(tmp493.getClass(), tmp498, 1);
                                Object tmp500 = null;
                                if ( tmp499 != null ) { 
                                    try {
                                        tmp499.setAccessible(true);
                                        if ( tmp499.getReturnType() == void.class ) {
                                            tmp500 = _Nil.prototype;
                                            tmp499.invoke(tmp493, tmp495);
                                        }
                                        else {
                                            tmp500 = tmp499.invoke(tmp493, tmp495);
                                        }
                                    }
                                    catch ( java.lang.reflect.InvocationTargetException tmp501 ) {
                                    	Throwable t__ = tmp501.getCause();
                                    	if ( t__ instanceof ExceptionContainer__ ) {
                                        	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                    	}
                                    	else
                                    		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                    }
                                    catch (IllegalAccessException | IllegalArgumentException tmp501) {
                                            throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp496) ) );
                                    }
                                }
                                else { 
                                    //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                                    java.lang.reflect.Method tmp502 = CyanRuntime.getJavaMethodByName(tmp493.getClass(), "_doesNotUnderstand_2", 2);
                                    if ( tmp502 == null ) {
                                        throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                                    }
                                    try {
                                        _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                        _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                        arrayParam._add_1(tmp495);
                                        arrayArrayParam._add_1( arrayParam );
                                        tmp502.setAccessible(true);
                                        tmp500 = tmp502.invoke(tmp493, new CyString(tmp496), arrayArrayParam);
                                    }
                                    catch ( java.lang.reflect.InvocationTargetException tmp503 ) {
                                    	Throwable t__ = tmp503.getCause();
                                    	if ( t__ instanceof ExceptionContainer__ ) {
                                        	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                    	}
                                    	else
                                    		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                    }
                                    catch (IllegalAccessException | IllegalArgumentException tmp503) {
                                            throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp498) ) );
                                    }
                                }
                                java.lang.reflect.Method tmp504 = CyanRuntime.getJavaMethodByName(tmp500.getClass(), "_print", 0);
                                if ( tmp504 == null ) { tmp504 = CyanRuntime.getJavaMethodByName(tmp500.getClass(), "print", 0); }
                                Object tmp505 = null;
                                if ( tmp504 != null ) { 
                                    try {
                                        tmp504.setAccessible(true);
                                        if ( tmp504.getReturnType() == void.class ) {
                                            tmp505 = _Nil.prototype;
                                            tmp504.invoke(tmp500);
                                        }
                                        else {
                                            tmp505 = tmp504.invoke(tmp500);
                                        }
                                    }
                                    catch ( java.lang.reflect.InvocationTargetException tmp506 ) {
                                    	Throwable t__ = tmp506.getCause();
                                    	if ( t__ instanceof ExceptionContainer__ ) {
                                        	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                    	}
                                    	else
                                    		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                    }
                                    catch (IllegalAccessException | IllegalArgumentException tmp506) {
                                            throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("print") ) );
                                    }
                                }
                                else { 
                                    //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
                                    java.lang.reflect.Method tmp507 = CyanRuntime.getJavaMethodByName(tmp500.getClass(), "_doesNotUnderstand_2", 2);
                                    if ( tmp507 == null ) {
                                        throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
                                    }
                                    try {
                                        _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                                        _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                                        arrayArrayParam._add_1( arrayParam );
                                        tmp507.setAccessible(true);
                                        tmp505 = tmp507.invoke(tmp500, new CyString("print"), arrayArrayParam);
                                    }
                                    catch ( java.lang.reflect.InvocationTargetException tmp508 ) {
                                    	Throwable t__ = tmp508.getCause();
                                    	if ( t__ instanceof ExceptionContainer__ ) {
                                        	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
                                    	}
                                    	else
                                    		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
                                    }
                                    catch (IllegalAccessException | IllegalArgumentException tmp508) {
                                            throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("_print") ) );
                                    }
                                }
                                _Nil tmp509 = _Nil.prototype;
                                (new CyString(" "))._print();
                            }
                        }
                    }
                }
            }
        }
        return ;
        } 

    public void _ex1() {

        CyString _s;
        _s = (new CyString("+"));

        CyString _mn;
        _mn = (new CyString("substring:"));
        String tmp512 = "";
        tmp512 += ((CyString ) _s).s;
        char tmp513 = tmp512.charAt(0);
        if ( (tmp513 == '_' || Character.isAlphabetic(tmp513) ) && !tmp512.endsWith(":") ) { tmp512 += ":"; }
        String tmp514 =  CyanRuntime.getJavaNameOfMethod(new String[] { ((CyString ) _s).s }, new int[] {1} );
        java.lang.reflect.Method tmp515 = null;
        tmp515 = CyanRuntime.getJavaMethodByName((new CyInt( (int ) 3)).getClass(), tmp514, 1);
        Object tmp516 = null;
        if ( tmp515 != null ) { 
            try {
                tmp515.setAccessible(true);
                if ( tmp515.getReturnType() == void.class ) {
                    tmp516 = _Nil.prototype;
                    tmp515.invoke((new CyInt( (int ) 3)), (new CyInt( (int ) 7)));
                }
                else {
                    tmp516 = tmp515.invoke((new CyInt( (int ) 3)), (new CyInt( (int ) 7)));
                }
            }
            catch ( java.lang.reflect.InvocationTargetException tmp517 ) {
            	Throwable t__ = tmp517.getCause();
            	if ( t__ instanceof ExceptionContainer__ ) {
                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
            	}
            	else
            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
            }
            catch (IllegalAccessException | IllegalArgumentException tmp517) {
                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp512) ) );
            }
        }
        else { 
            //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
            java.lang.reflect.Method tmp518 = CyanRuntime.getJavaMethodByName((new CyInt( (int ) 3)).getClass(), "_doesNotUnderstand_2", 2);
            if ( tmp518 == null ) {
                throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
            }
            try {
                _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                arrayParam._add_1((new CyInt( (int ) 7)));
                arrayArrayParam._add_1( arrayParam );
                tmp518.setAccessible(true);
                tmp516 = tmp518.invoke((new CyInt( (int ) 3)), new CyString(tmp512), arrayArrayParam);
            }
            catch ( java.lang.reflect.InvocationTargetException tmp519 ) {
            	Throwable t__ = tmp519.getCause();
            	if ( t__ instanceof ExceptionContainer__ ) {
                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
            	}
            	else
            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
            }
            catch (IllegalAccessException | IllegalArgumentException tmp519) {
                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp514) ) );
            }
        }
        _Any tmp520;
        if ( tmp516 instanceof _Any ) 
            tmp520 = (_Any ) tmp516;
        else
            throw new ExceptionContainer__(new _ExceptionCast( new CyString("Cannot cast expression '(3 `s: 7)' to 'cyan.lang.Any' in line 84 of file Program.cyan") ) );
        _Nil tmp510 = _Nil.prototype;
        _Out.prototype._println_1( tmp520);
        String tmp523 = "";
        tmp523 += ((CyString ) _mn).s;
        char tmp524 = tmp523.charAt(0);
        if ( (tmp524 == '_' || Character.isAlphabetic(tmp524) ) && !tmp523.endsWith(":") ) { tmp523 += ":"; }
        String tmp525 =  CyanRuntime.getJavaNameOfMethod(new String[] { ((CyString ) _mn).s }, new int[] {1} );
        java.lang.reflect.Method tmp526 = null;
        tmp526 = CyanRuntime.getJavaMethodByName((new CyString("abcde")).getClass(), tmp525, 1);
        Object tmp527 = null;
        if ( tmp526 != null ) { 
            try {
                tmp526.setAccessible(true);
                if ( tmp526.getReturnType() == void.class ) {
                    tmp527 = _Nil.prototype;
                    tmp526.invoke((new CyString("abcde")), CyInt.two);
                }
                else {
                    tmp527 = tmp526.invoke((new CyString("abcde")), CyInt.two);
                }
            }
            catch ( java.lang.reflect.InvocationTargetException tmp528 ) {
            	Throwable t__ = tmp528.getCause();
            	if ( t__ instanceof ExceptionContainer__ ) {
                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
            	}
            	else
            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
            }
            catch (IllegalAccessException | IllegalArgumentException tmp528) {
                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp523) ) );
            }
        }
        else { 
            //	func doesNotUnderstand: (String methodName, Array<Array<Dyn>> args)
            java.lang.reflect.Method tmp529 = CyanRuntime.getJavaMethodByName((new CyString("abcde")).getClass(), "_doesNotUnderstand_2", 2);
            if ( tmp529 == null ) {
                throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString("doesNotUnderstand") ) );
            }
            try {
                _Array_LT_GP__Array_LT_GP_Object_GT_GT arrayArrayParam = new _Array_LT_GP__Array_LT_GP_Object_GT_GT();
                _Array_LT_GP_Object_GT arrayParam = new _Array_LT_GP_Object_GT();
                arrayParam._add_1(CyInt.two);
                arrayArrayParam._add_1( arrayParam );
                tmp529.setAccessible(true);
                tmp527 = tmp529.invoke((new CyString("abcde")), new CyString(tmp523), arrayArrayParam);
            }
            catch ( java.lang.reflect.InvocationTargetException tmp530 ) {
            	Throwable t__ = tmp530.getCause();
            	if ( t__ instanceof ExceptionContainer__ ) {
                	throw new ExceptionContainer__( ((ExceptionContainer__) t__).elem );
            	}
            	else
            		throw new ExceptionContainer__( new _ExceptionJavaException(t__));
            }
            catch (IllegalAccessException | IllegalArgumentException tmp530) {
                    throw new ExceptionContainer__( new _ExceptionDoesNotUnderstand(new CyString(tmp525) ) );
            }
        }
        _Any tmp531;
        if ( tmp527 instanceof _Any ) 
            tmp531 = (_Any ) tmp527;
        else
            throw new ExceptionContainer__(new _ExceptionCast( new CyString("Cannot cast expression '(\"abcde\" `mn: 2)' to 'cyan.lang.Any' in line 85 of file Program.cyan") ) );
        _Nil tmp521 = _Nil.prototype;
        _Out.prototype._println_1( tmp531);
        return ;
        } 

    public @Override main._Program _prototype() {
         return prototype;
        
        } 

    public @Override main._Program _clone() {
        
        try {
            return (_Program ) this.clone(); 
        } catch (CloneNotSupportedException e) { }
        return null;
        
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp532 = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        return tmp532;
        } 

    public @Override _Array_LT_GP__Any_GT _getAnnotListNameDoesNotCollide____() {
        _Array_LT_GP__Any_GT tmp533 = new _Array_LT_GP__Any_GT();

        return tmp533;
        } 

    public @Override _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _getSlotFeatureListNameDoesNotCollide____() {
        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT tmp534 = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();

        _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT _slotFeatureList__name__does__not__collide____;
        _slotFeatureList__name__does__not__collide____ = tmp534;

        return _slotFeatureList__name__does__not__collide____;
        } 
    public static _Program prototype;

    static final String []fieldList = { "d" };
    static final String []fieldTypeList = { "cyan.lang.Any" };
    public static _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT featureList = new _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    public static _Array_LT_GP__Any_GT annotList = new _Array_LT_GP__Any_GT();

    static final _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT slotFeatureList = new _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT();
    static CyString []methodNameList = { 
        new CyString("run -> Nil"),
        new CyString("toJson: Any -> String"),
        new CyString("_getMethodName: String -> String"),
        new CyString("getSomething4 -> Any"),
        new CyString("ex3 -> Nil"),
        new CyString("ex2 -> Nil"),
        new CyString("ex1 -> Nil"),
        new CyString("prototype -> main.Program"),
        new CyString("clone -> main.Program"),
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
        String s =  "Program {\n";
        s = s + "super(Any):"  + super.asStringThisOnly( ident + _Any.defaultIdentNumber__ );
        s = s + asStringThisOnly( ident + _Any.defaultIdentNumber__);

        s = s + getWhiteSpaces(ident) + "}\n";
        return s;
    } 
    @Override 
    protected String asStringThisOnly(int ident) {
        String s = getWhiteSpaces(ident);
        s = s + getWhiteSpaces(ident) + "d: " + _d._asString().s + "\n";
        return s;
    } 
    protected _Any parent() {
        return _Any.prototype;
    }
    protected CyString prototypePackage() {
        return new CyString( "main" );
    }
    static final String prototypeName = "Program";
    @Override     public String getPrototypeName() { return prototypeName; }
    protected boolean isInterface() { return false; }

    @Override public _Array_LT_GP__Tuple_LT_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getFeatureList() { return featureList; }
    @Override public _Array_LT_GP__Tuple_LT_GP__slotName_GP_CyString_GP__key_GP_CyString_GP__value_GP__Any_GT_GT getSlotFeatureList() { return slotFeatureList; }
    @Override public _Array_LT_GP__Any_GT getAnnotList() { return annotList; }
    static {
    }

}
