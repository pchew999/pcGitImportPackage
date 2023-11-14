

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class gitImport

{
	// ---( internal utility methods )---

	final static gitImport _instance = new gitImport();

	static gitImport _newInstance() { return new gitImport(); }

	static gitImport _cast(Object o) { return (gitImport)o; }

	// ---( server methods )---




	public static final void longrunning (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(longrunning)>> ---
		// @sigtype java 3.5
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// --- <<IS-END>> ---

                
	}
}

