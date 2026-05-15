pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});

let res = pm.response.json();

pm.test("Verify updatedAt exists", function () {
    pm.expect(res.updatedAt).to.not.be.undefined;
});
