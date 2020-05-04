/**
 * FSS Financial Services
 * This service allows to submit payments, purchases and sales Items to SBBs financial system FSS based on SAP Hybris Billing. Depending on the agreed functionalities the Items can be priced, validated, enriched, posted in the subledger and reported. For more information please check the FSS website or contact the team.
 *
 * OpenAPI spec version: 1.0.1
 * Contact: dl_fss_all@sbb.ch
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class SalesItem (
  transactionTime: TransactionTime,
  /* This is the final price amount including VAT (less dectuctible if appliable in case of refund) - Minus amounts are not allowed, this is managed by the transactionType. If the Product has to be priced in SAP Brim, the field Price should contain Zero (0.00) and priceCalculationInformation has to be delivered. */
  price: Price,
  vat: Vat,
  /* The system used by the saleschannel to purchase the product for the customer. Usually its similar to the supplier but it can differ for plattforms which connect different suppliers. */
  bookingSystem: String,
  /* Supplier who's providing the product for the customer and who will get the money for this purchase. */
  supplier: String,
  /* This is an optional field for a customerID in the suppliers bookingsystem - if needed */
  customerID: Option[String] = None,
  /* Number of the product in the article master of the distributionchannel */
  productNumberSBB: Option[String] = None,
  /* Name of the product in the article master of the distributionchannel */
  productDescriptionSBB: Option[String] = None,
  /* Number of the product in suppliers bookingsystem */
  productNumberSupplier: String,
  /* ID for the whole order in suppliers bookingsystem - if not available repeat the supplierSalesReferenceNr */
  orderId: String,
  /* ID for a purchase in suppliers bookingsystem. */
  referenceNr: String,
  commissionRule: Option[CommissionRule] = None
) extends ApiModel


