/**
 * nano-rpc-api
 * API specification for the [Nano Node RPC API](https://docs.nano.org/commands/rpc-protocol)
 *
 * The version of the OpenAPI document: 19.0.0-alpha
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/**
 *
 * @export
 * @interface AccountsPendingRequest
 */
export interface AccountsPendingRequest {
    /**
     *
     * @type {string}
     * @memberof AccountsPendingRequest
     */
    action?: AccountsPendingRequestActionEnum;
    /**
     *
     * @type {Array<string>}
     * @memberof AccountsPendingRequest
     */
    accounts?: Array<string>;
    /**
     *
     * @type {string}
     * @memberof AccountsPendingRequest
     */
    count?: string;
    /**
     *
     * @type {boolean}
     * @memberof AccountsPendingRequest
     */
    includeActive?: boolean;
    /**
     *
     * @type {boolean}
     * @memberof AccountsPendingRequest
     */
    source?: boolean;
}
export declare function AccountsPendingRequestFromJSON(json: any): AccountsPendingRequest;
export declare function AccountsPendingRequestToJSON(value?: AccountsPendingRequest): any;
/**
* @export
* @enum {string}
*/
export declare enum AccountsPendingRequestActionEnum {
    AccountsPending = "accounts_pending"
}
