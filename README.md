# postgresql Arbitrary File Write Vulnerability

## Affect Version

42.3.x, 42.1.x

## Patched Version

42.3.3

## Reproduction

Run the poc, and you will generate the evil.jsp in the temp dir "/tmp" 

![](image/1.png)

P.S. No need to run a real postgres DB.

## Reference

https://github.com/pgjdbc/pgjdbc/security/advisories/GHSA-673j-qm5f-xpv8