SELECT 
    AUTO_INCREMENT
FROM
    INFORMATION_SCHEMA.TABLES
WHERE
    TABLE_NAME = 'contatos'
        AND TABLE_SCHEMA = 'owyea276_fj21';
        
        
ALTER TABLE contatos AUTO_INCREMENT = 3;