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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface KeyCreateResponse
 */
export interface KeyCreateResponse {
    /**
     * 
     * @type {string}
     * @memberof KeyCreateResponse
     */
    _private?: string;
    /**
     * 
     * @type {string}
     * @memberof KeyCreateResponse
     */
    _public?: string;
    /**
     * 
     * @type {string}
     * @memberof KeyCreateResponse
     */
    account?: string;
}

export function KeyCreateResponseFromJSON(json: any): KeyCreateResponse {
    return {
        '_private': !exists(json, 'private') ? undefined : json['private'],
        '_public': !exists(json, 'public') ? undefined : json['public'],
        'account': !exists(json, 'account') ? undefined : json['account'],
    };
}

export function KeyCreateResponseToJSON(value?: KeyCreateResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'private': value._private,
        'public': value._public,
        'account': value.account,
    };
}


