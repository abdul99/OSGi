package osgimaven;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceEvent;
 
/**
 * This class implements a simple bundle that utilizes the OSGi
 * framework's event mechanism to listen for service events. Upon
 * receiving a service event, it prints out the event's details.
**/
public class Activator implements BundleActivator, ServiceListener
{
    /**
     * Implements BundleActivator.start(). Prints
     * a message and adds itself to the bundle context as a service
     * listener.
     * @param context the framework context for the bundle.
    **/
    public void start(BundleContext context)
    {
        System.out.println("Starting to listen for service event");
        context.addServiceListener(this);
    }
 
    /**
     * Implements BundleActivator.stop(). Prints
     * a message and removes itself from the bundle context as a
     * service listener.
     * @param context the framework context for the bundle.
    **/
    public void stop(BundleContext context)
    {
      //  context.removeServiceListener(this);
        System.out.println("Stopped listening for service event");
 
        // Note: It is not required that we remove the listener here,
        // since the framework will do it automatically anyway.
    }

	public void serviceChanged(ServiceEvent arg0) {
		// TODO Auto-generated method stub
		
	}
 
    /**
     * Implements ServiceListener.serviceChanged().
     * Prints the details of any service event from the framework.
     * @param event the fired service event.
    **/
     
}
