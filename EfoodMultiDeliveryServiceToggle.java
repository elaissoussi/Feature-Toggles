package net.auchan.efood.core.core.toggle;

/**
 * {@code MultiDeliveryServiceToggler} is Toggle Implementation for MultiDeliveryService
 * 
 * @author elaissoussi.monsif
 */
public class EfoodMultiDeliveryServiceToggle implements EfoodFeatureToggle
{
	private static final String MULTI_SERVICE_TOGGLE_KEY = "efood.multi.delivery.service.enabled";

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFeatureEnabled() 
	{
		return isToggleEnabled(MULTI_SERVICE_TOGGLE_KEY);
	}
}
