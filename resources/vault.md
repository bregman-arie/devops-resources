## Cheat Sheet

* Start Vault server in dev mode (NOT FOR PRODUCTION): `vault server -dev`
* Set up vault client (dev mode):

```
export VAULT_ADDTR='http://<VAULT_ADDRESS>'
echo <KEY> > unseal.key
export VAULT_DEV_ROOT_TOKEN_ID=...
vault status
```

* Write a secret using one pair of key, value: `vault kv put secret/hello foo=bar`
* Write a secret using multiple pairs of key, value: `vault kv put secret/hello foo=bar y=x`

* Get a secret: `vault kv get secret/hello`
