pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});

let res = pm.response.json();

pm.test("Job updated successfully", function () {
    pm.expect(res.job).to.eql("Senior QA");
});

pm.test("updatedAt exists", function () {
    pm.expect(res.updatedAt).to.not.be.undefined;
});
