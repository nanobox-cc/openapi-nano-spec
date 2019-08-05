// tslint:disable
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
import { exists } from '../runtime';
export function AccountsCreateRequestFromJSON(json) {
    return {
        'action': !exists(json, 'action') ? undefined : json['action'],
        'wallet': !exists(json, 'wallet') ? undefined : json['wallet'],
        'count': !exists(json, 'count') ? undefined : json['count'],
    };
}
export function AccountsCreateRequestToJSON(value) {
    if (value === undefined) {
        return undefined;
    }
    return {
        'action': value.action,
        'wallet': value.wallet,
        'count': value.count,
    };
}
/**
* @export
* @enum {string}
*/
export var AccountsCreateRequestActionEnum;
(function (AccountsCreateRequestActionEnum) {
    AccountsCreateRequestActionEnum["AccountsCreate"] = "accounts_create";
})(AccountsCreateRequestActionEnum || (AccountsCreateRequestActionEnum = {}));
