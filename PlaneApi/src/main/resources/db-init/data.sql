/*=======================================
* Insertion dans la table FACTION
=======================================*/
INSERT INTO FACTION (id, name, flag) VALUES (1, 'FRANCE', 'http://....');
INSERT INTO FACTION (id, name, flag) VALUES (2, 'ESPAGNE', 'http://....');
INSERT INTO FACTION (id, name, flag) VALUES (3, 'ALLEMAGNE', 'http://....');
INSERT INTO FACTION (id, name, flag) VALUES (4, 'ANGLETERRE', 'http://....');
INSERT INTO FACTION (id, name, flag) VALUES (5, 'RUSSIE', 'http://....');
INSERT INTO FACTION (id, name, flag) VALUES (6, 'AMERIQUE', 'http://....');
INSERT INTO FACTION (id, name, flag) VALUES (7, 'CHINE', 'http://....');
INSERT INTO FACTION (id, name, flag) VALUES (8, 'JAPON', 'http://....');
INSERT INTO FACTION (id, name, flag) VALUES (9, 'EUROPE', 'http://....');
/*=======================================
* Insertion dans la table SYSTEM
=======================================*/
INSERT INTO SYSTEM (id, type, name, brand) VALUES (1, 'Module Gerre Electronique', 'SPECTRA', 'THALES TAS');
INSERT INTO SYSTEM (id, type, name, brand) VALUES (2, 'Module Gerre Electronique', 'UNO', 'THALES TAS');

/*=======================================
* Insertion dans la table MOTORIZATION
=======================================*/
INSERT INTO MOTORIZATION(id, name, type, brand, FACTION_ID) VALUES (1, 'Snecma M88', 'propulsion', 'DASSULT', 1);
INSERT INTO MOTORIZATION(id, name, type, brand, FACTION_ID) VALUES (2, 'Snecma M53-P2', 'propulsion', 'DASSULT', 1);
INSERT INTO MOTORIZATION(id, name, type, brand, FACTION_ID) VALUES (3, 'Snecma-Turbomeca Larzac 04C6', 'propulsion', 'DASSULT', 1);

/*=======================================
* Insertion dans la table PLANE
=======================================*/
INSERT INTO PLANE(id, name, image, description, FACTION_ID, MOTORIZATION_ID, SYSTEM_ID) VALUES
(1,'RAFALE',
'https://....',
'Avion multirole Français',
1, 1, 1);