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
 * @enum {string}
 */
export declare enum BlockState {
    Send = "send"
}
export declare function BlockStateFromJSON(json: any): BlockState;
export declare function BlockStateToJSON(value?: BlockState): any;
