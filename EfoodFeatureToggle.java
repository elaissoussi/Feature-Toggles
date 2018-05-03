package net.auchan.efood.core.core.toggle;

import de.hybris.platform.util.Config;

/**
 * {@code EfoodFeatureToggle} enable/disable Features of application via Toggle configuration
 * 
 * "Feature Toggling" allowing modification of system behavior without changing code
 * 
 * @author elaissoussi.monsif
 */
public interface EfoodFeatureToggle 
{
	/**
	 * Check if the Whole Feature is Enabled 
	 * 
	 * @return true, false
	 */
	 boolean isFeatureEnabled();
	
	/**
	 * Check if a Toggle  is Enabled using its key
	 * 
	 * @param toggleKey
	 * 
	 * @return true, false
	 */
	default boolean isToggleEnabled(String toggleKey)
	{
		return Config.getBoolean(toggleKey, false);
	}
}
