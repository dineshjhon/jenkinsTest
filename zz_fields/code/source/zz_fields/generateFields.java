package zz_fields;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class generateFields

{
	// ---( internal utility methods )---

	final static generateFields _instance = new generateFields();

	static generateFields _newInstance() { return new generateFields(); }

	static generateFields _cast(Object o) { return (generateFields)o; }

	// ---( server methods )---




	public static final void util (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(util)>> ---
		// @sigtype java 3.5
		// [i] field:1:required fieldNames
		// [o] record:0:required output
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String[]	fieldNames = IDataUtil.getStringArray( pipelineCursor, "fieldNames" );
		pipelineCursor.destroy();
				
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		
		// output
		IData	output = IDataFactory.create();
		IDataCursor outputCursor = output.getCursor();
		int i;
		for(i=0;i<fieldNames.length;i++) {
			IDataUtil.put( outputCursor, fieldNames[i], "" );
			
		}
		outputCursor.destroy();
		IDataUtil.put( pipelineCursor_1, "output", output );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

