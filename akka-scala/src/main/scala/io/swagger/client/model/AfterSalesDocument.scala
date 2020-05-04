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

case class AfterSalesDocument (
  /* UUID generated by sales channel - this Id connects all corrsponding sales and payments in one business case with a customer */
  businessCaseId: String,
  technicalInformation: TechnicalInformation,
  salesPoint: SalesPoint,
  aftersalesItems: Seq[AftersalesItem]
) extends ApiModel


